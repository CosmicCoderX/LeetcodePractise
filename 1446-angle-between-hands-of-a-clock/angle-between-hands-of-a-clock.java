class Solution {
    public double angleClock(int hour, int minutes) {
        double hrsAngle = (hour*30) + (minutes*0.5);
        double minAngle = minutes*6;

        double angle = Math.abs(hrsAngle - minAngle);
        angle = Math.min(angle, 360-angle);
        return angle;
    }
}