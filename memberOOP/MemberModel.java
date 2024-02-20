package memberOOP;

public class MemberModel {
    private String id;
    private int pw;
    private String name;
    private int socialNum;
    private int phoneNum;
    private String adress;

    public void setId(String id){
        this.id = id;
    }
    public String getId(){
        return id;
    }
    //-------------------------
    public void setPw(int pw){
        this.pw = pw;
    }
    public int getPw(){
        return pw;
    }
    //-------------------------
    public void setName(String name){
        this.name = name;
    }
    public String getname(){
        return name;
    }
    //-------------------------
    public void setsocialNum(int socialNum){
        this.socialNum = socialNum;
    }
    public int getsocialNum(){
        return socialNum;
    }
    //-------------------------
    public void setphoneNum(int phoneNum){
        this.phoneNum = phoneNum;
    }
    public int getphoneNum(){
        return phoneNum;
    }
    //-------------------------
    public void setadress(String adress){
        this.adress = adress;
    }
    public String getadress(){
        return adress;
    }
}
