package br.com.rd.rdevs.contextoDoArtefatoDesenvolvido.main;

import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import br.com.rd.rdevs.contextoDoArtefatoDesenvolvido.modelContrato.Trabalho;

public class TestaContratos {
	public static void main(String[] args) {
		Trabalho t = new Trabalho();
		Trabalho t2 = new Trabalho();
		Trabalho t3 = new Trabalho();
		
		t.setNumRegistroContrato(4578752);
		t.setNomePartes("Vitor");
		t2.setNomeCartorio("Cartorio Osasco");
		t.getTotal();
		t.emitirContrato(t);
		t3.emitirContrato(t3);
		
		t2.setNomePartes("Rodrigues");
		t2.setNomeCartorio("Cartorio Taboao");
		
		//t3.setNomeCartorio("Cartorio Embu");
		
		
		//UTILIZANDO LIST
		System.out.println("\n");
		List<String> arrayPartes = new ArrayList();
		arrayPartes.add(t.getNomePartes());
		arrayPartes.add(t2.getNomePartes());
		
		for (int i = 0; i < arrayPartes.size(); i++) {
			System.out.println("Posição " + i + " = " + arrayPartes.get(i));
		}
		
		//UTILIZANDO SET
		 Set<String> arrayCartorio = new HashSet<String>();
		 
		 arrayCartorio.add(t.getNomeCartorio());
		 arrayCartorio.add(t2.getNomeCartorio());
		 arrayCartorio.add(t3.getNomeCartorio());
		 
		 System.out.println("Nome Cartórios: " + arrayCartorio); 
		
	}
}
