package br.edu.ifsc;

import java.time.LocalDate;
import java.util.List;

public class GerenciadorLivro {
	private LivroDao lDao;
	public GerenciadorLivro(LivroDao ldao) {
		this.lDao = ldao;
	}
	public void cancelarReservas() {
		//buscar livros reservados 
		List<Livro> reservados = lDao.listarReservados();
		//percorre e verificar se a reserva é maior que 7 dias ou nao.
        for(Livro l:reservados){
            LocalDate dtLim = LocalDate.now().minusDays(7);
            if(l.isReservado() && l.getDataReserva().isBefore(dtLim)) {
		        //caso seja deve cancelarReserva
                l.cancelaReserva();
		        //persistir no bd o livro alterado
		        lDao.alterar(reservados.get(0));
            }
        }
	}
	public boolean salvaLivro(Livro l) {
		try {
			lDao.inserir(l);
			return true;
		}catch(RuntimeException e) {
			return false;
		}
	}
}
