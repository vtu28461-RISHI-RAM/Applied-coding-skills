import java.util.*;

class UndergroundSystem {

    class CheckIn {
        String station;
        int time;

        CheckIn(String station, int time) {
            this.station = station;
            this.time = time;
        }
    }

    class Route {
        int totalTime;
        int count;

        Route(int totalTime, int count) {
            this.totalTime = totalTime;
            this.count = count;
        }
    }

    HashMap<Integer, CheckIn> passengers;
    HashMap<String, Route> routes;

    public UndergroundSystem() {
        passengers = new HashMap<>();
        routes = new HashMap<>();
    }

    public void checkIn(int id, String stationName, int t) {
        passengers.put(id, new CheckIn(stationName, t));
    }

    public void checkOut(int id, String stationName, int t) {

        CheckIn checkIn = passengers.get(id);

        String route = checkIn.station + "#" + stationName;

        int travelTime = t - checkIn.time;

        if (!routes.containsKey(route)) {
            routes.put(route, new Route(travelTime, 1));
        } else {
            Route r = routes.get(route);
            r.totalTime += travelTime;
            r.count++;
        }

        passengers.remove(id);
    }

    public double getAverageTime(String startStation, String endStation) {

        String route = startStation + "#" + endStation;

        Route r = routes.get(route);

        return (double) r.totalTime / r.count;
    }
}