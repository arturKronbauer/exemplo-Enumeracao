package aplicacao;

import java.util.Date;

import entidades.Pedido;
import entidades.Enumeradas.StatusPedido;

public class Programa {

	public static void main(String[] args) {

		Pedido pedido = new Pedido(1080, new Date(), StatusPedido.PAGAMENTO_PENDENTE);

		System.out.println(pedido);

		// criando um objeto do tipo Enumerado 
		StatusPedido sp = StatusPedido.PROCESSANDO;
		pedido.setStatus(sp);
		System.out.println(pedido);

		// atribuindo um novo valor para o objeto Enumerado
		sp = StatusPedido.ENVIADO;
		pedido.setStatus(sp);
		System.out.println(pedido);

		// atribuindo um novo para o objeto enumerado a partir de uma string
		sp = StatusPedido.valueOf("ENTREGUE");
		pedido.setStatus(sp);
		System.out.println(pedido);
	}
}
