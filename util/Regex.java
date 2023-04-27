package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    static final String REGEX_NAME = "^([A-Z][a-z]{2,9}(\\s)){1,3}([A-Z][a-z]{2,9})$";
    static final String REGEX_CODE_EMPLOYEE = "^((NV)(-))([0-9]{4})$";
    static final String REGEX_CODE_CUSTOMER = "^((KH)(-))([0-9]{4})$";
    static final String REGEX_AGE = "^(((1)|(2))[0-9]{3})(-)((0)[1-9]|(1)[0-2])(-)(((0)[1-9])|((1|2)[0-9])|((3)[0-1]))$";
    static final String REGEX_ID_VILLA = "^(SVVL-)[0-9]{4}$";
    static final String REGEX_ID_HOUSE = "^(SVHO-)[0-9]{4}$";
    static final String REGEX_ID_ROOM = "^(SVRO-)[0-9]{4}$";
    static final String REGEX_NAME_SERVICE = "^([A-Z])([a-z]+)$";





    public static boolean checkNamePerson(String name) {
        return name.matches(REGEX_NAME) ? true : false;
    }

    public static boolean checkCodeEmployee(String code) {
        return code.matches(REGEX_CODE_EMPLOYEE) ? true : false;
    }

    public static boolean checkCodeCustomer(String code) {
        return code.matches(REGEX_CODE_CUSTOMER) ? true : false;
    }

    public static boolean checkIdCard(String idCard) {
        final String REGEX_IDCARD = "^(([0-9]{9})|([0-9]{12}))$";
        Pattern pattern = Pattern.compile(REGEX_IDCARD);
        Matcher matcher = pattern.matcher(idCard);
        return matcher.matches();
    }

    public static boolean checkAge(String age) {
        return age.matches(REGEX_AGE) ? true : false;
    }

    public static boolean checkNumberPhone(String numberPhone) {
        final String REGEX_NUMBERPHONE = "^((0))([1-9]{9})$";
        Pattern pattern = Pattern.compile(REGEX_NUMBERPHONE);
        Matcher matcher = pattern.matcher(numberPhone);
        return matcher.matches();
    }

    public static boolean checkIdVilaa(String idVilla) {
        return idVilla.matches(REGEX_ID_VILLA) ? true : false;
    }

    public static boolean checkIdHouse(String idHouse) {
        return idHouse.matches(REGEX_ID_HOUSE) ? true : false;
    }

    public static boolean checkIdRoom(String idRoom) {
        return idRoom.matches(REGEX_ID_ROOM) ? true : false;
    }

    public static boolean checkNameService(String nameService) {
        return nameService.matches(REGEX_NAME_SERVICE) ? true : false;
    }

    public static boolean checkArea(String str) {
        String regex = "^([3-9][0-9])|([1-9][0-9]{2,})$";
        return (str.matches(regex));
    }

    public static boolean checkPriceAndNumberOfFloors(String str) {
        String regex = "^[0-9]+$";
        return (str.matches(regex));
    }

    public static boolean checkNumberHumanMax(String str) {
        String regex = "^(1[0-9]+)|[1-9]$";
        return (str.matches(regex));
    }

    public static boolean checkDayStartAndEnd(String str) {
        String regex = "^((0[1-9])||([1-2][0-9])||(3[0-1]))\\/((0[1-9])||(1[0-2]))\\/(20(([0-1][0-9])||(2[0-3])))$";
        if (str.matches(regex)) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean checkUnderAge(String age) {
        LocalDateTime date = LocalDateTime.now();
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String st = dtf.format(date);
        System.out.println("Ngày hôm nay: " + st);
        LocalDateTime date1 = LocalDateTime.parse(age, dtf);
        LocalDateTime dateTime1 = date.minusYears(18);
        LocalDateTime dateTime2 = date1.plusYears(0);
        boolean flag = dateTime1.isAfter(dateTime2);
        if (flag) {
            return true;
        } else {
            return false;
        }
    }
}
