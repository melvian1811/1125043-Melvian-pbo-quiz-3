package prakpboquiz.model;

import java.util.*;

public abstract class Dataview<T> {
    
    public void printAll(){

    }

    public void printByPk(String primaryKey){

    }

    public void showInsertForm(){

    }

    public void showUpdateForm(){

    }

    public void promptDelete(){

    }

    protected abstract String getPrimaryKeyValue(T data){

    }

    protected abstract String[] getFields(){

    }

    protected abstract T convertValuesToModel(String[] values){

    }

    protected abstract String[] convertModelToValue(T data){

    }
}
