package com.epam.infra;

import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

/**
 * @author Evgeny Borisov
 */
@Service
public class CCL extends ClassLoader {
    @Override
    @SneakyThrows
    public Class<?> findClass(String className) {
        String fileName = "target/classes/"+className.replace('.', File.separatorChar) + ".class";
        byte[] bytecode =  Files.newInputStream(Path.of(fileName)).readAllBytes();
        return defineClass(className, bytecode, 0, bytecode.length);
    }



}
