package CompositeDesignPattern;

public class TestComposite {
	public static void main(String[] args) {
		SongComponent industrialMusic = new SongGroup("Industrial", "bleh bleh");
		SongComponent heavyMetalMusic = new SongGroup("Heavy Metal", "more bleh bleh");
		SongComponent dubStepMusic = new SongGroup("DubStep", "even more bleh bleh");
		
		SongComponent everySong = new SongGroup("SongList", "Every song available");
		everySong.add(industrialMusic);
		
		industrialMusic.add(new Song("1234", "5678", 1990));
		industrialMusic.add(new Song("1234", "5678", 1990));
		industrialMusic.add(new Song("1234", "5678", 1990));
		
		industrialMusic.add(dubStepMusic);
		dubStepMusic.add(new Song("asfd", "asdfasd", 1991));
		
		everySong.add(heavyMetalMusic);
		heavyMetalMusic.add(new Song("rock", "roll", 1973));
		
		DiscJockey crazyDiscJockey = new DiscJockey(everySong);
		
		crazyDiscJockey.getSongList();
	}
}
