import java.util.*;

/**
 * Planet class
 */
interface Planet {
    interface room{
        public void readRoomFile()throws Exception;
        interface character{
            public void readCharacterFile() throws Exception;
            public void passiveMode() throws Exception;
        }
        interface items{
            public void readItemFile();
        }
        interface monster{
            public void readMonsterFile();
        }
    }
}