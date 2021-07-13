package curso;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.matheusbonnet.api.entities.Curso;

class CursoTeste {
	
	@Test
	void test() {

	}
	
	@Test
	void cursoNaoVazio() {
		Curso cursos = new Curso();
		assertNotNull(cursos);
		
	}

}
