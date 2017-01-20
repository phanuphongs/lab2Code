/**
 * Created by patricksuphalawut on 1/18/17.
 */
public class GameCharacterYoung extends GameCharacter{
    public GameCharacterYoung(){
        guitarBehavior = new Guitar_GibsonSG();
        soloBehavior = new Solo_JumpOffStage();
    }
    public void change() {
        this.setGuitar(new Guitar_Telecaster());
    }
}
