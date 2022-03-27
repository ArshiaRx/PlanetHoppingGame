import java.util.*;

/**
 * Planet class
 */
interface Planet {
    public void Inventory()throws Exception;
    public void ClearInventory() throws Exception;
    interface room{
        public void readRoomFile()throws Exception;
        public void North()throws Exception;
        public void FirstEast()throws Exception;
        public void West() throws Exception;
        public void South() throws Exception;
        interface character{
            public void readCharacterFile() throws Exception;
        }
        interface items{
            public void readItemFile();
        }
        interface monster{
            public void readMonsterFile() throws Exception;
        }
    }
}