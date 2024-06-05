package capgeminiprogram.com.polymerphismpart2;

public class MainPrintMedia {
	public static void main(String args[]) {
		Book book = new Book();
		book.setAuthor("Ruskin Bond");
		book.setName("Ruskin Bond");
		
		NewsPaper newspaper = new NewsPaper();
		newspaper.setNewsPaperName("Times Of India");
		newspaper.setJobAdvertisment(true);
		
		Magzines magzine = new Magzines();
		magzine.setPublisherBrand("Vouge");
		magzine.setModelName("Rekha");
		
		System.out.println(book);
		System.out.println(newspaper);
		System.out.println(magzine);
	}
}
