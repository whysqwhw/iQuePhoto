package net.iquesoft.iquephoto.presentation.presenter.fragment.interfaces;

import net.iquesoft.iquephoto.common.BaseFragmentPresenter;
import net.iquesoft.iquephoto.core.editor.enums.EditorCommand;
import net.iquesoft.iquephoto.presentation.view.fragment.TransformStraightenView;

public interface TransformStraightenPresenter extends BaseFragmentPresenter<TransformStraightenView> {
    void setupTransform(EditorCommand editorCommand);
}