public class Star {

    private String starName;
    private String roleName;

    public Star(String starName, String roleName){
        this.starName = starName;
        this.roleName = roleName;
    }

    public String getStarName(){
        return starName;
    }

    public void setStarName(String starName){
        this.starName = starName;
    }

    public String getRoleName(){
        return roleName;
    }

    public void setRoleName(String roleName){
        this.roleName = roleName;
    }

    public String toString(){
        return starName + " as " + roleName;
    }


}
