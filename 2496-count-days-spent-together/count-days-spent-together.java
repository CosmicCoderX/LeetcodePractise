class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
        int A1 = dateTodayOfYear(arriveAlice);
        int A2 = dateTodayOfYear(leaveAlice);
        int B1 = dateTodayOfYear(arriveBob);
        int B2 = dateTodayOfYear(leaveBob);

        int overlapStart = Math.max(A1, B1);
        int overlapEnd = Math.min(A2, B2);

        return Math.max(0, overlapEnd - overlapStart + 1);
    }

    public int dateTodayOfYear(String str){
        int[] daysInMonth = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month = Integer.parseInt(str.substring(0, 2));
        int day = Integer.parseInt(str.substring(3, 5));

        int totalDay = day;
        for(int i=0; i<month-1; i++){
            totalDay += daysInMonth[i];
        }

        return totalDay;
    }
}