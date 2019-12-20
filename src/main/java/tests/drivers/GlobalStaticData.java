package tests.drivers;


import semantic_ui.utils.StringUtils;

class GlobalStaticData {

    private static String project;

    public static class project {
        public void randomProjectName() {
            StringUtils stringRandom = new StringUtils();
            String projectName = "Project " + stringRandom.randomString("numeric", 1);
            setProject(projectName);
        }

        void setProject (String p) {
            project = p;
        }

        String getProject() {
            return project;
        }

    }
}
