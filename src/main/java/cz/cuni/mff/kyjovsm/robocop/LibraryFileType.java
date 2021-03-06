package cz.cuni.mff.kyjovsm.robocop;

import com.intellij.openapi.fileTypes.LanguageFileType;
import com.jetbrains.python.PythonLanguage;
import cz.cuni.mff.kyjovsm.robocop.icons.LibraryIcons;
import icons.PythonIcons;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.Icon;

/**
 *
 */
public class LibraryFileType extends LanguageFileType {
    public static final LibraryFileType INSTANCE = new LibraryFileType();

    /**
     *
     */
    private LibraryFileType() {
        super(LibraryLanguage.INSTANCE);
    }

    /**
     * @return
     */
    @NotNull
    @Override
    public String getName() {
        return "Python Library.";
    }

    /**
     * @return
     */
    @NotNull
    @Override
    public String getDescription() {
        return "Python library for robot framework";
    }

    /**
     * @return
     */
    @NotNull
    @Override
    public String getDefaultExtension() {
        return "py";
    }

    /**
     * @return
     */
    @Nullable
    @Override
    public Icon getIcon() {
        return LibraryIcons.PYTHON_LIBRARY;
    }
}
