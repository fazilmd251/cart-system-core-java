public class Product {
    private String name;
    private float price;
    private int stock;

    Product(String name, float price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }


    public void setPrice(float price) {
        this.price = price;
    }

    public float getPrice() {
        return this.price;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public void increaseStock(){
        this.stock++;
    }

    public void decreaseStock(){
        if(this.stock>0)this.stock--;
    }

    public String displayProduct(){
        int boxWidth = 33; // total width including the 2 pipes
        int innerWidth = boxWidth - 2; // 31 chars between pipes

        StringBuilder sb = new StringBuilder();
        String border = "-".repeat(boxWidth);

        sb.append(border).append("\n");
        sb.append("|").append(" ".repeat(innerWidth)).append("|\n");

        appendLine(sb, "product name: " + this.name, innerWidth);
        appendLine(sb, "price: " + this.price, innerWidth);
        appendLine(sb, "stock: " + this.stock, innerWidth);

        sb.append("|").append(" ".repeat(innerWidth)).append("|\n");
        sb.append(border);

        return sb.toString();
    }

    private void appendLine(StringBuilder sb, String text, int innerWidth) {
        sb.append("| ").append(text);
        int spaces = innerWidth - 1 - text.length(); // -1 for the space after |
        if (spaces < 0) spaces = 0; // prevent negative if text is too long
        sb.append(" ".repeat(spaces)).append("|\n");
    }
}
