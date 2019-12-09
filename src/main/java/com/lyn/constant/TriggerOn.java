package com.lyn.constant;

/**
 * 提示框触发的条件
 *
 *'mousemove|click': 同时鼠标移动和点击时触发。
 * 不在 'mousemove' 或 'click' 时触发，用户可以通过 action.tooltip.showTip 和 action.tooltip.hideTip 来手动触发和隐藏。
 */
public enum TriggerOn {
    /**
     * 鼠标移动时触发。
     */
    mousemove,
    /**
     * 鼠标点击时触发。
     */
    click,
    /**
     * 不在 'mousemove' 或 'click' 时触发
     */
    none,
}
