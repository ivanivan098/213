package Application;

public class MyList
{
    Node first;
    Node last;
    public  void add(int index, String value)
    {
      Node nn = new Node();
      Node current;
      Node prevv;
      nn.value = value;
      if(first == null)
      {

          first = nn;
          last = nn;
      }
      else {
          if(index < -1 || index >=CountNodes())
          {
              System.out.println("Введено неверное значение");
          }
          else {
                  current = first;
                  prevv = null;
                  int i = 0;
                  while (i != index + 1) {

                      prevv = current;
                      current = current.next;
                      i++;

                  }
                  if(index == -1)
                  {
                      nn.next = current;
                      current.prev = nn;
                      first = nn;
                  }
                  else{
                      nn.next = current;
                      nn.prev = prevv;
                      prevv.next = nn;
                  }


          }
      }

    }
    public void remove(int index)
    {
        Node current;
        Node prevv = new Node();
        Node Next;
        boolean exist = false;
        current = first;
        int i =0;
        if(first == null){
            System.out.println("Список пуст");
        }
        else {
            if(index == 0)
            {
                if(first.next == null)
                {
                    first = null;
                }
                else {
                    first = first.next;
                    first.prev = null;
                }
            }
            else{

            while (i != index) {
                prevv = current;
                if(current.next == null){
                    i = index;
                     exist = false;
                }
                else {
                    current = current.next;
                    exist = true;
                    i++;
                }
            }
            if(exist == false)
            {
                System.out.println("Данного элемента не сушествует");
            }
            else {
                if (current.next == null) {
                    prevv.next = null;
                    current.prev = null;
                } else {
                    Next = current.next;
                    Next.prev = prevv;
                    prevv.next = Next;
                }
            }

            }
        }
    }


        public void ShowList ()
        {
            if(first == null)
            {
                System.out.println("Список пуст");
                System.out.println();
            }
            else {
                Node current = first;
                while (current != null) {
                    System.out.print(current.value + " ");
                    current = current.next;
                }
                System.out.println();
            }
        }
        public int CountNodes()
        {
            Node current = first;
            int i = 1;
            while (current.next != null)
            {
                current = current.next;
                i++;
            }
            return i;
        }
}
