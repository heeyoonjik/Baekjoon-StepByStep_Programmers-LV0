import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int v = Integer.parseInt(st.nextToken());
        int result;
        if(a == v) {
            result = 1;
        }else if(a-b<=v-a){
            if((v-a)%(a-b) == 0){
                result = ((v-a)/(a-b))+1;
            }else{
                result = ((v-a)/(a-b))+2;
            }
        }
        else{
            result = (v / (a - b)) + 1;
        }
        bw.write(result + "");
        bw.flush();
        bw.close();
    }
}