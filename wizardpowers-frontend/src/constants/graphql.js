import gql from "graphql-tag";

export const ALL_WIZARDS_QUERY = gql`
    query AllWizardsQuery {
        wizards {
            id
            type
            name
            powerLevel
        }
    }`;