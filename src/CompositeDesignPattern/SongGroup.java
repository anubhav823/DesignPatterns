package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class SongGroup extends SongComponent {

	List<SongComponent> songComponentList = new ArrayList<>();
	String groupName;
	String groupDescription;

	public SongGroup(String groupName, String groupDescription) {
		this.groupName = groupName;
		this.groupDescription = groupDescription;
	}

	public String getGroupName() {
		return groupName;
	}

	public String getGroupDescription() {
		return groupDescription;
	}

	public void add(SongComponent songComponent) {
		songComponentList.add(songComponent);
	}

	public void remove(SongComponent songComponent) {
		songComponentList.add(songComponent);
	}

	public SongComponent get(int componentIndex) {
		return (SongComponent) songComponentList.get(componentIndex);
	}
	
	public void displaySongInfo() {
		System.out.println(getGroupName()+" "+getGroupDescription());
		Iterator songIterator = songComponentList.iterator();
		while(songIterator.hasNext()) {
			SongComponent songInfo = (SongComponent) songIterator.next();
			songInfo.displaySongInfo();
		}
	}

}
