package Enums;

public enum Car {
    HatchBack,Sedan,SUV;

    public static Car getEnumFromInteger(int val)
    {
        return switch (val) {
            case 1 -> HatchBack;
            case 2 -> Sedan;
            case 3 -> SUV;
            default -> throw new IllegalArgumentException("Invalid Car Selection");
        };
    }

}
