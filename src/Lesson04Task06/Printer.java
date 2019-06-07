package Lesson04Task06;

//6. Create a class and demonstrate proper encapsulation techniques
//    the class will be called Printer
//    It will simulate a real Computer printer
//    It should have fields for toner level, number of pages printed, and also
//    whether its a duplex printer (capable of printing on both sides of the paper).
//    Add methods to fill up the toner (up to a maximum of 100%), another method to
//    simulate printing a page(which should increase the number of pages printed).
//    Decide on the scope, whether to use constructors, and anything else you think is needed.

//Example of fields:
//private String manufacturer;
//private String model;
//private boolean isColor;
//private String type;
//private boolean isDuplex;
//private int tonerLevelBlack;
//private int tonerLevelMagenta;
//private int tonerLevelYellow;
//private int tonerLevelBlue;
//private int printedPages;
//    Example of methods:
//    fillUp(int tonerVolume, String color);
//    print(int pages, String color, boolean isDuplex);
//    tonerIsEmpty();
//    getTonerLevel(String toner);
//    etc.

public class Printer {

    private String manufacturer;
    private String model;
    private boolean isColor;
    private String type;
    private boolean isDuplex;
    private int tonerLevelBlack;
    private int tonerLevelMagenta;
    private int tonerLevelYellow;
    private int tonerLevelBlue;
    private int printedPages;

    public Printer(){
        this ("DefaultManufacturer", "DefaultModel");
    }

    public Printer(String manufacturer, String model){
        this.manufacturer = manufacturer;
        this.model = model;
        if(manufacturer == "HP" && model == "LaserJet4000"){
            isColor = false;
            type = "laser";
            isDuplex = false;
            tonerLevelBlack = 100;
            tonerLevelMagenta = 0;
            tonerLevelYellow = 0;
            tonerLevelBlue = 0;
            printedPages = 0;
        }
        if(manufacturer == "DefaultManufacturer" && model == "DefaultModel"){
            isColor = false;
            type = "laser";
            isDuplex = false;
            tonerLevelBlack = 100;
            tonerLevelMagenta = 0;
            tonerLevelYellow = 0;
            tonerLevelBlue = 0;
            printedPages = 0;
        }
    }

    public void fillUp(int tonerVolume){
        fillUp(tonerVolume, "black");
    };

    public void fillUp(int tonerVolume, String color){
        switch (color){
            case "black" : {
                tonerLevelBlack = tonerCalc(tonerLevelBlack, tonerVolume);
                break;
            }
            case "magenta" : {
                tonerLevelMagenta = tonerCalc(tonerLevelMagenta, tonerVolume);
                break;
            }
            case "yellow" : {
                tonerLevelYellow = tonerCalc(tonerLevelYellow, tonerVolume);
                break;
            }
            case "blue" : {
                tonerLevelBlue = tonerCalc(tonerLevelBlue, tonerVolume);
                break;
            }
            default : {
                tonerLevelBlack = tonerCalc(tonerLevelBlack, tonerVolume);
            }
        }
    }

    private int tonerCalc(int level, int tonerVolume){
        level += tonerVolume;
        level = (level > 100) ? 100 : level;
        level = (level < 0) ? 0 : level;
        return level;
    }

    public void print(int pages, String color, boolean isDuplex){
        pages = isDuplex ? (pages * 2) : pages;
        printedPages += pages;
        switch (color){
            case "black" : {
                tonerLevelBlack = tonerCalc(tonerLevelBlack, -pages);
                break;
            }
            case "magenta" : {
                tonerLevelMagenta = tonerCalc(tonerLevelMagenta, -pages);
                break;
            }
            case "yellow" : {
                tonerLevelYellow = tonerCalc(tonerLevelYellow, -pages);
                break;
            }
            case "blue" : {
                tonerLevelBlue = tonerCalc(tonerLevelBlue, -pages);
                break;
            }
            default : {
                tonerLevelBlack = tonerCalc(tonerLevelBlack, -pages);
            }
        }
    }

    public void tonerIsEmpty(){
        String emptyTonners = "";
        emptyTonners += (tonerLevelBlack == 0) ? "black" : "";
        emptyTonners += (tonerLevelMagenta == 0) ? ", magenta" : "";
        emptyTonners += (tonerLevelBlue == 0) ? ", blue" : "";
        emptyTonners += (tonerLevelYellow == 0) ? ", yellow" : "";
        System.out.println( (emptyTonners == "") ?  "There are no empty tonners" :  "There are " + emptyTonners + " tonners empty.");
    }
    public  int getTonerLevel(String tonerColor){
        switch (tonerColor){
            case "black" : {
                return tonerLevelBlack;
            }
            case "magenta" : {
                return  tonerLevelMagenta;
            }
            case "yellow" : {
                return tonerLevelYellow;
            }
            case "blue" : {
                return tonerLevelBlue;
            }
            default : {
                return tonerLevelBlack;
            }
        }
    }

    public int getPrintedPages() {
        return printedPages;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getModel() {
        return model;
    }

    public String getType() {
        return type;
    }

    public static void main(String[] args) {
        Printer printer = new Printer();
        System.out.println(printer.manufacturer);
    }

}
