package top.viewv.test;

import org.junit.BeforeClass;
import soot.Scene;
import soot.options.Options;

import java.util.ArrayList;
import java.util.List;

public class BaseTest {
    @BeforeClass
    public static void setUpBeforeClass() {

        List<String> dir = new ArrayList<>();
        dir.add("target/test-classes");

        Options.v().set_process_dir(dir);
        Options.v().set_whole_program(true);
        Options.v().set_verbose(false);
        Options.v().set_keep_line_number(true);
        Options.v().set_keep_offset(true);
        Options.v().set_allow_phantom_refs(true);
        Options.v().set_prepend_classpath(true);

        Options.v().set_output_format(Options.output_format_jimple);
        Options.v().setPhaseOption("jb","use-original-names:true");

        Scene.v().loadNecessaryClasses();
    }
}
