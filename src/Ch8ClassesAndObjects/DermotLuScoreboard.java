package Ch8ClassesAndObjects;

public class DermotLuScoreboard {
    public class Scoreboard {
        private String team1;
        private int team1_points;
        private String team2;
        private int team2_points;
        private boolean active_team_is_1;

        public Scoreboard(String team1, String team2) {
            this.team1 = team1;
            this.team2 = team2;
            team1_points = 0;
            team2_points = 0;
            active_team_is_1 = true;
        }

        public void recordPlay(int points) {
            if (points > 0) {
                if (active_team_is_1) team1_points += points;
                else team2_points += points;
            } else {
                active_team_is_1 = !active_team_is_1;
            }
        }

        public String getScore() {
            return team1_points + "-" + team2_points + "-" + ((active_team_is_1) ? team1 : team2);
        }
    }
}
