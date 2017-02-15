package aulaexception;

import java.io.Closeable;
import java.io.IOException;

public class TesteFechavel implements Closeable{

	@Override
	public void close() throws IOException {
		System.out.println("Fechei");
	}

}
