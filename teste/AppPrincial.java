package teste;

import java.util.ArrayList;
import java.util.List;

public class AppPrincial {
	public static void main(String[] args) {
		List<Animal> animals1 = new ArrayList<>();
		Dog dog1 = new Dog("pichula", "femia", "daumata");
		Gato gato1 = new Gato("bixano", "macho", "sata");

		animals1.add(dog1);
		animals1.add(gato1);
		Dono dono1 = new Dono("jair", animals1);

		
		
		List<Animal> animals2 = new ArrayList<>();
		Gato gato2 = new Gato("osvaudo", "trans", "mimipika");
		Gato gato3 = new Gato("lula", "gay", "sata");

		animals2.add(gato2);
		animals2.add(gato3);
		Dono dono2 = new Dono("jubileu", animals2);

		
		
		List<Animal> animals3 = new ArrayList<>();
		Dog dog2 = new Dog("leleu", "femia", "daumata");
		Dog dog3 = new Dog("dilma", "macho", "sata");

		animals3.add(dog2);
		animals3.add(dog3);
		Dono dono3 = new Dono("nadson", animals3);
		
		List<Dono>donos=new ArrayList<>();
		
		donos.add(dono1);
		donos.add(dono2);
		donos.add(dono3);


		for (Dono dono : donos) {
			System.out.println("----------------");
			for (Animal animal: dono.getListaMeusAnimais()) {
				if(animal instanceof Dog) {
				System.out.println("nome do dono "+dono.getNome()+" nome do animal "+animal.getNome()+" sexo "+ animal.getSexo()+" raça "+animal.getRaca());
				}
			}
			
		}

	}

}
