//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {
    Pedido pedido = new Pedido(1,"Julian",StatusPedido.AGUARDANDO_PAGAMENTO);
    pedido.avancarStatus(pedido);
    IO.println(pedido.getStatus());

    pedido.avancarStatus(pedido);
    IO.println(pedido.getStatus());
    pedido.cancelarPedido();
}
