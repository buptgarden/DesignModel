package com.garden.build.factories;

import com.garden.common.buttons.Button;
import com.garden.common.checkboxs.CheckBox;


/**
 * 抽象工厂这里使用的是接口，而不是像工厂模式使用的是抽象类，是因为没有需要继承的渲染方法。抽象工厂的接口
 * 负责构建一系列的物品，而抽象工厂往往只构建一个物品，所以足够简单，可以在抽象类中定义渲染流程。但是一系
 * 列产品的模式下，再让工厂方法持有渲染方法就不合适了，因为很难兼顾所有物品的渲染方式，但是这里如果确定每
 * 个物品的渲染和使用方式，使用抽象类也可以。但是总体来说，这一些列物品的使用交给更加上层的概念持有是比较
 * 合适的。
 */
public interface GUIFactory {
    Button createButton();
    CheckBox createCheckBox();
}
