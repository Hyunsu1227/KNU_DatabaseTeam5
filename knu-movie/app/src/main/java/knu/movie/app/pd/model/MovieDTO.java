package knu.movie.app.pd.model;

import java.util.ArrayList;
import java.util.List;

import knu.movie.app.pd.interfaces.DTO;

public class MovieDTO implements DTO {
    private String titleId;
    private String title;
    private	String region;
    private String runtime;
    private String startYear;
    private Integer total;
    private String numVotes;
    private Integer num;
    private Double avg;
    private List<String> genreList = new ArrayList<String>();
    private List<String> actorList = new ArrayList<String>();
    private String type;

    public MovieDTO() {
        super();
    }

    public MovieDTO(MovieDTO a)
    {
        this.titleId = a.titleId;
        this.title = a.title;
        this.region = a.region;
        this.runtime = a.runtime;
        this.startYear = a.startYear;
        this.total = a.total;
        this.numVotes = a.numVotes;
        this.num = a.num;
        this.avg = a.avg;
        this.genreList = a.genreList;
        this.actorList = a.actorList;
        this.type = a.type;
    }

    public MovieDTO(String titleId, String title, String region, String runtime, String startYear, Integer total, String numVotes, Integer num, Double avg, ArrayList<String> genreList, String type, ArrayList<String> actorList){
        this.titleId = titleId;
        this.title = title;
        this.region = region;
        this.runtime = runtime;
        this.startYear = startYear;
        this.total = total;
        this.numVotes = numVotes;
        this.num = num;
        this.avg = avg;
        this.genreList.addAll(genreList);
        this.type = type;
        this.actorList.addAll(actorList);
    }

    public String getTitleId(){
        return this.titleId;
    }

    public String getTitle(){
        return this.title;
    }
    public String getRegion(){
        return this.region;
    }
    public String getRuntime(){
        return this.runtime;
    }
    public String getStartYear(){
        return this.startYear;
    }
    public Integer getTotal(){
        return this.total;
    }
    public String getNumVotes(){
        return this.numVotes;
    }
    public Integer getNum(){
        return this.num;
    }
    public Double getAvg(){
        return this.avg;
    }
    public List<String> getGenreList(){
        return this.genreList;
    }
    public String getType(){
        return this.type;
    }
    public List<String> getActorList(){
        return this.actorList;
    }

    public void setTitleId(String titleId){
        this.titleId = titleId;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setRegion(String region){
        this.region = region;
    }
    public void setRuntime(String runtime){
        this.runtime = runtime;
    }
    public void setStartYear(String startYear){
        this.startYear = startYear;
    }
    public void setTotal(Integer total){
        this.total = total;
    }
    public void setNumVotes(String numVotes){
        this.numVotes = numVotes;
    }
    public void setNum(Integer num){
        this.num = num;
    }
    public void setAvg(Double avg){
        this.avg = avg;
    }
    public void setGenreList(List<String> genreList){
        this.genreList = genreList;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setAcotrList(List<String> actorList){
        this.actorList = actorList;
    }

}
