import java.io.IOException;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

class jarporttrial
{public static void main(String args[]){
	try {
		Document doc = Jsoup.connect("https://twitter.com/search?q=CEO%20from%3ACNBCSocial%20since%3A2009-01-01%20until%3A2009-06-30&src=typd").get();
		System.out.println(doc.html().replaceAll("\\s+", " "));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}