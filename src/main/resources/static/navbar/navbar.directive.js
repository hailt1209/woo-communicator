'use strict';

angular.module("navbar")
    .directive("navbar", function() {
        return {
            restrict: "E",
            replace: true,
            transclude: true,
            templateUrl: "navbar/navbar.template.html",
            compile: function(element, attrs) {
                // var li, divNavigationTabs, link, index, length;
                // divNavigationTabs = $(element).find("#navigation-tabs div");
                // for (index = 0, length = divNavigationTabs.length; index < length; index++) {
                //     link = divNavigationTabs[index];
                //     // links = $(li).find("a");
                //     if (link.textContent === attrs.currentTab) $(link).addClass("active");
                // }
            }
        }});
;