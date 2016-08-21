package br.com.fl.lotofacil;

import java.lang.annotation.Documented;
@Documented //Anota��es aparecer na documenta��o

public @interface SobreOProjeto {
	
	String nomeProjeto();
	double versaoProjeto();
	String criador();
	String ultimaRevisao();
	int revisao() default 1;
	
	
	
}
