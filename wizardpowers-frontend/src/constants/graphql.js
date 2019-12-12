import gql from "graphql-tag";

export const ALL_WIZARDS_QUERY = gql`
    query getWizards {
        wizards {
            id
            type
            name
            powerLevel
        }
    }`;

export const ADD_WIZARD_MUTATION = gql`
    mutation addWizard($name: String!, $type: String!, $powerLevel: Int!) {
        addWizard(
            name: $name,
            type: $type,
            powerLevel: $powerLevel,
        ) {
            id
            name
            type
            powerLevel
        }
    }
    `;

export const UPDATE_WIZARD_MUTATION = gql`
    mutation updateWizard($id: ID, $name: String!, $type: String!, $powerLevel: Int!) {
        updateWizard(
            id: $id,
            name: $name,
            type: $type,
            powerLevel: $powerLevel,
        ) {
            id
            name
            type
            powerLevel
        }
    }
    `;

export const DELETE_WIZARD_MUTATION = gql`
    mutation deleteWizard($id: ID) {
        deleteWizard(id: $id) {
            id
        }
    }`;