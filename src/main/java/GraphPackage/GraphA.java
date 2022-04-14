package GraphPackage;

import org.graphstream.algorithm.generator.Generator;
import org.graphstream.algorithm.generator.RandomGenerator;

public class GraphA {
    private Generator gen = new RandomGenerator();

    public Generator getGen() {
        return gen;
    }

    public void setGen(Generator gen) {
        this.gen = gen;
    }

    public void Method() {
        gen.begin();
        gen.end();
    }
}
