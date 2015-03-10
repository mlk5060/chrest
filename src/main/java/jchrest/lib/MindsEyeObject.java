package jchrest.lib;

/**
 * Represents an object in the mind's eye.
 * 
 * @author Martyn Lloyd-Kelly <martynlk@liverpool.ac.uk>
 */
public class MindsEyeObject {
  
  private final String _identifier;
  private Integer _terminus;
  
  public MindsEyeObject(String identifier, int terminusValue){
    this._identifier = identifier;
    this._terminus = terminusValue;
  }
  
  public String getIdentifier(){
    return this._identifier;
  }
  
  public int getTerminus(){
    return this._terminus;
  }
  
  public void setTerminus(int newTerminus){
    this._terminus = newTerminus;
  }
}
