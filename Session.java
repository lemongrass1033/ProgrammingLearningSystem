public class TeamMatch {

    private String email;

    private double score;

    public TeamMatch(
            String email,
            double score){

        this.email = email;
        this.score = score;
    }

    public String getEmail(){
        return email;
    }

    public double getScore(){
        return score;
    }
}