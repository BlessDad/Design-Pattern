public abstract class Lamp {
        private Direction lampStatus;
        public void light(Direction direction) {
            if (lampStatus == direction) return;
            doLight(lampStatus);
            setLampStatus(lampStatus);
        }
        public Direction getLampStatus() {
            return lampStatus;
        }

        public void setLampStatus(Direction lampStatus) {
            this.lampStatus = lampStatus;
        }

        protected abstract void doLight(Direction lampStatus);


    }


