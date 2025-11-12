public class Vendas {

    private String waiter;
    private Integer table;
    private String product;
    private double price;

    public Vendas(String garcom, Integer mesa, String item, double preco) {
        this.waiter = garcom;
        this.table = mesa;
        this.product = item;
        this.price = preco;
    }

    public String getWaiter() {
        return waiter;
    }

    public Integer getTable() {
        return table;
    }

    public String getProduct() {
        return product;
    }

    public double getPrice() {
        return price;
    }

    public void infoVenda(){

        System.out.println("---------Itens vendidos--------");
        System.out.println("Garçom: " + waiter);
        System.out.println("Mesa: " + table);
        System.out.println("Produto: " + product);
        System.out.println("Preço: R$" + price);
        System.out.println("--------------------------------");
    }

}
