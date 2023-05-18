public class NextDayCalculator {
    private int day, month, year, dayMonth;
    private boolean yearNhuan;

    public void setDayMonthYear(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int[] getNextDayMonthYear() {
        checkYearNhuan();
        getDayMonth();
        nextDayOne();
        int[] result = {day, month, year};
        return result;
    }

    private void nextDayOne() {
        if(day==dayMonth){
            day=1;
            if(month==12){
                month=1;
                year+=1;
            }else {
                month+=1;
            }
        }else {
            day+=1;
        }
    }

    private void getDayMonth() {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dayMonth = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dayMonth = 30;
                break;
            case 2:
                if (yearNhuan) {
                    dayMonth = 29;
                } else {
                    dayMonth = 28;
                }
        }
    }

    private void checkYearNhuan() {
        if (year % 4 == 0) {
            yearNhuan = true;
        } else if (year % 400 == 0) {
            yearNhuan = true;
        } else {
            yearNhuan = false;
        }
    }
}