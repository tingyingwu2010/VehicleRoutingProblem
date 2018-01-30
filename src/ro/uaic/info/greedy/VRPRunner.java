package ro.uaic.info.greedy;

import ro.uaic.info.VRP;
import ro.uaic.info.VRPLibReader;
import thiagodnf.jacof.util.io.InstanceReader;

import java.io.File;
import java.io.IOException;

public class VRPRunner {
    public static void main(String[] args) throws IOException {
        VRPLibReader r = new VRPLibReader(new InstanceReader(new File("datasets/" + VRP.FILE + ".vrp")));
        GreedySolver s = new GreedySolver(r, 20);
        s.solve();
        s.print();
    }
}
