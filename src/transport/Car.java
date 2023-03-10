package transport;

import java.util.Objects;

public class Car extends Transport {
    private double engineVolume;
    private String gears;
    private final String typeOfBody;
    private String regNumber;
    private final int seatsCount;
    private boolean summerTiers;
    private final Key key;

    public Car(
            String brand,
            String model,
            double engineVolume,
            String color,
            int productionYear,
            String productionCountry,
            String gears,
            String typeOfBody,
            String regNumber,
            int seatsCount,
            boolean summerTires,
            Key key) {

        super(brand, model, productionYear, productionCountry, color);


        if (engineVolume <= 0) {
            engineVolume = 1.5;
        }
        this.engineVolume = engineVolume;


        if (typeOfBody == null || typeOfBody.isEmpty()) {
            typeOfBody = "неопределен";
        }
        this.typeOfBody = typeOfBody;


        if (gears == null || gears.isEmpty()) {
            gears = "Механическа КПП";
        }
        this.gears = gears;

        if (regNumber == null || regNumber.isEmpty()) {
            regNumber = "x000xx000";
        }
        this.regNumber = regNumber;

        this.key = Objects.requireNonNullElseGet(key, Key::new);
        this.seatsCount = seatsCount;
        this.summerTiers = summerTires;
    }

    public Car(String brand, String model, double engineVolume, String color, int productionYear, String productionCountry) {
        this(
                brand,
                model,
                engineVolume,
                color,
                productionYear,
                productionCountry,
                "Механическа КПП",
                "неопределен",
                "x000xx000",
                5,
                true,
                new Key()
        );
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public String getGears() {
        return gears;
    }

    public void setGears(String gears) {
        if (gears == null) {
            this.gears = "Механическа КПП";
        } else {
            this.gears = gears;
        }
    }

    public String getRegNumber() {
        return regNumber;
    }

    public boolean isSummerTiers() {
        return summerTiers;
    }

    public void setSummerTiers(boolean summerTiers) {
        this.summerTiers = summerTiers;
    }

    public String getTypeOfBody() {
        return typeOfBody;
    }

    public int getSeatsCount() {
        return seatsCount;
    }

    public Key getKey() {
        return key;
    }

    public void setRegNumber(String regNumber) {
        if (regNumber == null) {
            this.regNumber = "x000xx000";
        } else {
            this.regNumber = regNumber;
        }
    }

    public boolean isCorrectRegNumber() {
        if (regNumber.length() != 9) {
            return false;
        }
        char[] chars = regNumber.toCharArray();
        if (!Character.isAlphabetic(chars[0]) || !Character.isAlphabetic(chars[4]) || !Character.isAlphabetic(chars[5])) {
            return false;
        }
        return Character.isDigit(chars[1]) && Character.isDigit(chars[2]) && Character.isDigit(chars[3]) && Character.isDigit(chars[6]) && Character.isDigit(chars[7]) && Character.isDigit(chars[8]);
    }

    public static class Key {
        private final boolean remoteStartEngine;
        private final boolean keylessAccess;

        public Key(boolean remoteStartEngine, boolean keylessAccess) {
            this.remoteStartEngine = remoteStartEngine;
            this.keylessAccess = keylessAccess;
        }

        public Key() {
            this(false, false);
        }

        public boolean isRemoteStartEngine() {
            return remoteStartEngine;
        }

        public boolean isKeylessAccess() {
            return keylessAccess;
        }
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() +
                ", год выпуск: " + getProductionYear() +
                ", страна сборки " + getProductionCountry() +
                ", цвет кузова: " + getColor() +
                ", объем двигателя: " + getEngineVolume() +
                ", коробка передач: " + getGears() +
                ", тип кузова " + getTypeOfBody() +
                ", рег. номер " + getRegNumber() +
                ", количество мест " + getSeatsCount() +
                ",   " + (isSummerTiers() ? "летняя" : "зимняя") + " резина" +
                (getKey().isKeylessAccess() ? " доступ без ключа" : " доступ с ключом") + ", " +
                (getKey().isRemoteStartEngine() ? " дистанционный запуск двигателя" : " " +
                        "классический запуск двигателя");

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Car car = (Car) o;
        return Double.compare(car.engineVolume, engineVolume) == 0 && seatsCount == car.seatsCount && summerTiers == car.summerTiers && Objects.equals(gears, car.gears) && Objects.equals(typeOfBody, car.typeOfBody) && Objects.equals(regNumber, car.regNumber) && Objects.equals(key, car.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), engineVolume, gears, typeOfBody, regNumber, seatsCount, summerTiers, key);
    }
}

