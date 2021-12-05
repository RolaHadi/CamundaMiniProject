package com.company;

import java.util.ArrayList;

public interface ILocation {
    String latitude = null;
    String longitude = null;
    ArrayList<Camera> cameras = null;

    String getLatitude();
    String getLongitude();
    ArrayList<Visitor> getVisitors();
    void setLatitude(String latitude);
    void setLongitude(String longitude);
    void addCameras(Camera camera);

    class Mall implements ILocation {
        @Override
        public String getLatitude() {
            return null;
        }

        @Override
        public String getLongitude() {
            return null;
        }

        @Override
        public ArrayList<Visitor> getVisitors() {
            return null;
        }

        @Override
        public void setLatitude(String latitude) {

        }

        @Override
        public void setLongitude(String longitude) {

        }

        @Override
        public void addCameras(Camera camera) {

        }


    }

    class Ministry implements ILocation{
        @Override
        public String getLatitude() {
            return null;
        }

        @Override
        public String getLongitude() {
            return null;
        }

        @Override
        public ArrayList<Visitor> getVisitors() {
            return null;
        }

        @Override
        public void setLatitude(String latitude) {

        }

        @Override
        public void setLongitude(String longitude) {

        }

        @Override
        public void addCameras(Camera camera) {

        }

    }
}
