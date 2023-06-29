
// Create a class to find out whether the given year is leap year or not.(Use inheritance for this program)

class year{

    boolean isDivisableByFour(int year){
        if (year % 4 == 0) {
            return true;
        }
        return false;
    }

    boolean isDivisableByHundred(int year){
        if (year % 100 == 0) {
            return true;
        }
        return false;
    }

    boolean isDivisableByFourHundred(int year){
        if (year % 400 == 0) {
            return true;
        }
        return false;
    }
}

// Using single level inheritance 

class findLeapYear extends year{

    boolean LeapYear( int year)
    {
        if (isDivisableByHundred(year) && isDivisableByFourHundred(year)) {
            return true;
            
        }else if (!isDivisableByHundred(year) && isDivisableByFour(year)) {
            return true;
        } 
        return false;
    }

    void leap_nonleap(int year){
        if (LeapYear(year)) {
            System.out.println(year+" is a leap year");
        } else {
            System.out.println(year+" is not a leap year");
            
        }
    }

}



