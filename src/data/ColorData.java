package data;

public enum ColorData {
    BLUE("Голубой");


    private String color = "";
    ColorData(String color) {
        this.color = color;
    }
        public String getColor() {
            return color;
        }
    }

