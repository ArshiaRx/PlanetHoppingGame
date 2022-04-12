public interface Planet {
    interface room{
        public void readPlanetFile() throws Exception;
        public void readRoomFile() throws Exception;

        public void DiscoverNorth() throws Exception;
        public void North() throws Exception;

        public void DiscoverWest() throws Exception;
        public void West() throws Exception;

        public void DiscoverEast() throws Exception;
        public void East() throws Exception;

        public void DiscoverSouth() throws Exception;
        public void South() throws Exception;

        //public void DiscoverWest() throws Exception{
        /*@Override
        public void readCharacterFile() throws Exception {
                guides.NorthAssistant();
            }*/
        void readCharacterFile() throws Exception;
    }
    interface character{
        public void readCharacterFile() throws Exception;

    }
    interface Items{
        public void readItemFile();
    }
    interface Monster{
        public void readMonsterFile() throws Exception;
    }
}
