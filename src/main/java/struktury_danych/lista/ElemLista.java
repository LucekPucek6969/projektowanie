package struktury_danych.lista;

public class ElemLista {

        private int value;
        private ElemLista prev;
        private ElemLista next;

        public ElemLista(int value) {
            this.value = value;
            prev = next = null;
        }

        public int getValue() {
            return value;
        }

        public ElemLista getPrev() {
            return prev;
        }

        public ElemLista getNext() {
            return next;
        }

        public void setValue(int value) {
            this.value = value;
        }

        public void setPrev(ElemLista prev) {
            this.prev = prev;
        }

        public void setNext(ElemLista next) {
            this.next = next;
        }
}

