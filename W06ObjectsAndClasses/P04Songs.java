package W06ObjectsAndClasses;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class P04Songs {
    static class Songs {

        private String typeList;
        private String name;
        private String time;

        public Songs(String typeList, String name, String time) {
            this.typeList = typeList;
            this.name = name;
            this.time = time;
        }

        public String getTypeList() {
            return this.typeList;
        }

        public String getName() {
            return this.name;
        }

        public String getTime() {
            return this.time;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        List<Songs> allSongs = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String[] songsArr = scanner.nextLine().split("_");
            Songs songs = new Songs(songsArr[0], songsArr[1], songsArr[2]);
            allSongs.add(songs);

        }


        String typeListToPrint = scanner.nextLine();
        if (typeListToPrint.equals("all")) {
            for (Songs allSong : allSongs) {
                System.out.println(allSong.getName());
            }
        } else {
            for (Songs current : allSongs) {
                if (current.getTypeList().equals(typeListToPrint)) {
                    System.out.println(current.getName());
                }
            }
        }

    }
}
