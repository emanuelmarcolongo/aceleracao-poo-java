package com.holidayzer.holidayzerapi;

public class Holiday {
    private String name;
    private String date;

    Holiday(String name, String date) {
        this.name = name;
        this.date = date;
    }

    public String getName() {
        return this.name;
    }

    public String getDate() {
        return this.date;
    }

    static Holiday[] holidays = new Holiday[] {
            new Holiday("Confraternização Mundial", "01-01-2024"),
            new Holiday("Carnaval", "12-02-2024"),
            new Holiday("Sexta-feira Santa", "29-03-2024"),
            new Holiday("Tiradentes", "21-04-2024"),
            new Holiday("Dia do Trabalho", "01-05-2024"),
            new Holiday("Corpus Christi", "30-05-2024"),
            new Holiday("Independência do Brasil", "07-09-2024"),
            new Holiday("Nossa Senhora Aparecida", "12-10-2024"),
            new Holiday("Finados", "02-11-2024"),
            new Holiday("Proclamação da República", "15-11-2024"),
            new Holiday("Dia Nacional de Zumbi e da Consciência Negra", "20-11-2024"),
            new Holiday("Natal", "25-12-2024"),
    };

    public static String getAllHolidays() {

        String response = "";
        for (int i = 0; i < holidays.length; i++) {
            response += (holidays[i].getName() + " => " + holidays[i].getDate() + "\n");
        }

        return response;
    }

    public static String verifyHoliday(String date) {

        System.out.println(date);
        for (int i = 0; i < holidays.length; i++) {
            if (holidays[i].date.equals(date)) {
                return "A data " + holidays[i].getDate() + " é o feriado: " + holidays[i].getName();
            }
        }

        return "A data " + date + " não é feriado";
    }

    public static void main(String[] args) {
        getAllHolidays();
        System.out.println(verifyHoliday("01-01-2024"));
        System.out.println(verifyHoliday("02-01-2024"));
        System.out.println(verifyHoliday("batata"));
    }
}
